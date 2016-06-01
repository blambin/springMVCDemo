package entity;

public class Topic {

	private int id;
	private String title;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Topic(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
