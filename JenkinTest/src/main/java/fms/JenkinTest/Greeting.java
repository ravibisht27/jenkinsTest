package fms.JenkinTest;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see com.fms.Helloworld.IGreeting#getContent()
	 */
	public String getContent() {
		return content;
	}

	/* (non-Javadoc)
	 * @see com.fms.Helloworld.IGreeting#getId()
	 */
	
	public long getId() {
		return id;
	}
}