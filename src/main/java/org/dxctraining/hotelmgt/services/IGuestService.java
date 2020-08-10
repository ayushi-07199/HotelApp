package org.dxctraining.hotelmgt.services;

import java.util.List;

import org.dxctraining.hotelmgt.entities.Guest;



public interface IGuestService {
	
	public void addGuest(Guest guest);
	
	public void removeGuest(String id);
	
	public List<Guest> guestList();
	
	public Guest findGuest(String id);
}
