package oopWithNLayeredApp.core.Logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("mail gönderildi: " + data);
		
	}
	
}
