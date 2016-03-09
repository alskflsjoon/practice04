package prob4;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute ( String function ) {
		if ( function.equals("앱") ) {
			playApp();
			return;
		}
		
		super.execute( function );
	}

	private void playApp(){
		System.out.println("어플리케이션 실행");
	}
}
