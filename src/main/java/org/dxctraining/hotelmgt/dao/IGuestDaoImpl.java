package org.dxctraining.hotelmgt.dao;

import java.util.List;

import org.dxctraining.hotelmgt.entities.Guest;



public interface IGuestDaoImpl {
	
	public void addGuest(Guest guest);
	
	public void removeGuest(String id);
	
	public List<Guest> guestList();
	
	public Guest findGuest(String id);
}
