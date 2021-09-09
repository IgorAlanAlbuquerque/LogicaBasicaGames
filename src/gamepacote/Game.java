package gamepacote;


public class Game implements Runnable {
	
	private boolean isRunning;
	private Thread thred;
	
	public Game() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.start();
	}
	public synchronized void start() {
		isRunning = true;
		thred = new Thread(this);
		thred.start();
		
	}
	public void tick() {
		//atualizar
		System.out.println("pinto");
	}
	public void render() {
		//renderizar
		System.out.println("pequeno");
	}
	@Override
	public void run() {
		while(isRunning) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
