package mc.sn.semi.vo;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component("boardVO")
public class BoardVO {
	private int articleNO;
	private String content;
	private String ownerId;
	private String title;
	private String id;
	private Timestamp writedate;
	
	

	public BoardVO() {
		
	}
	
	public BoardVO(String content, String ownerId,String title, String id) {
		
		this.content=content;
		this.ownerId=ownerId;
		this.title=title;
		this.id=id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getArticleNO() {
		return articleNO;
	}

	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getWritedate() {
		return writedate;
	}

	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}
	
	
}