package com.lingtong.test;

public enum OzWitch {
    WEST("Miss Gulch"),       //相当于    OzWitch WEST = new OzWitch("Miss Gulch");
    NORTH("Glinda"),          //相当于   OzWitch NORTH = new OzWitch("Glinda");
    EAST("Wicked"),
    SOUTH("Good by inference");
    
    private String description;
    
    public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	private OzWitch(String description){
    	this.description = description;
    }
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(OzWitch oz :OzWitch.values()){
			if(oz.equals(OzWitch.NORTH)){
				oz.setDescription("fhahahhahha");
			}
			System.out.println(oz.name()+":"+oz.getDescription());
		}
	}
}
