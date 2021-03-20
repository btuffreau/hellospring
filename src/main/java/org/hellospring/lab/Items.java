package org.hellospring.lab;

public class Items {
	
	  private final long id;
	  private final String content;

	  public Items(long id, String content) {
	    this.id = id;
	    this.content = content;
	  }

	  public long getId() {
	    return id;
	  }

	  public String getContent() {
	    return content;
	  }

}
