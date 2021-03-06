package org.dxctraining.hotelmgt.services;

import java.util.List;

import org.dxctraining.hotelmgt.dao.GuestDaoImpl;
import org.dxctraining.hotelmgt.dao.IGuestDaoImpl;
import org.dxctraining.hotelmgt.entities.Guest;



public class GuestService implements IGuestService {
	IGuestDaoImpl dao = new GuestDaoImpl();

	@Override
	public void addGuest(Guest guest) {
		dao.addGuest(guest);
	}

	@Override
	public void removeGuest(String id) {
		dao.removeGuest(id);
	}

	@Override
	public List<Guest> guestList() {
		 return dao.guestList();
	}

	@Override
	public Guest findGuest(String id) {
		validateId(id);
		return dao.findGuest(id);
	}
	
    private void validateId(String id) {
        if(id==null || id.isEmpty())
        {
            throw  new NullPointerException("id cant be empty and null");
        }
    }



}
