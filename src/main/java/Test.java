

public class Test {

	public static void main(String[] args) {
		System.out.print("..");

		for (int i = 0; i < 100; i++) {

			new Thread(new Runnable() {

				public void run() {

					while (true) {

						System.out.println(Thread.currentThread().getId());

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}).start();

		}
	}

}
