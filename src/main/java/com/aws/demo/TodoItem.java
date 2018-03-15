package com.aws.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String timeline;
    private String type;
    private String complexity;

    public String getTimeline() {
		return timeline;
	}



	@Override
	public String toString() {
		return "TodoItem [id=" + id + ", timeline=" + timeline + ", type=" + type + ", complexity=" + complexity
				+ ", name=" + name + "]";
	}



	public TodoItem(String timeline, String type, String complexity, String name) {
		this.timeline = timeline;
		this.type = type;
		this.complexity = complexity;
		this.name = name;
	}



	public void setTimeline(String timeline) {
		this.timeline = timeline;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getComplexity() {
		return complexity;
	}



	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	private String name;
   // private char complete;

    public TodoItem() {}

    
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

     

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        return;
    }
    
}