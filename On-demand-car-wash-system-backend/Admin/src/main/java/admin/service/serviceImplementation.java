package admin.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.model.Admin;
import admin.model.CustomerRating;

import admin.model.washpack;

import admin.repository.Ratingrepo;
import admin.repository.Washrepo;
import admin.repository.adminrepo;

@Service
public class serviceImplementation implements adminservice {

	@Autowired
	private adminrepo AR;
	@Autowired
	private Ratingrepo RR;
	@Autowired
	private Washrepo WR;

	@Override
	public List<Admin> findAll() {
		
		return AR.findAll();
	}

	@Override
	public void saveadmin(Admin admin) {
		
		AR.save(admin);

	}

	@Override
	public void updateadmin(Admin admin) {
		
		AR.save(admin);

	}

	@Override
	public void deleteadmin(int id) {
		
		AR.deleteById(id);

	}


	@Override
	public List<washpack> getwashpack() {
		
		return WR.findAll();
	}

	@Override
	public void savepack(washpack Washpacks) {
		
		WR.save(Washpacks);

	}

	@Override
	public void updatepack(washpack updatepack) {
		
		WR.save(updatepack);

	}

	@Override
	public void deletepack(int id) {
		
		WR.deleteById(id);

	}

	@Override
	public List<CustomerRating> getuser() {
		
		return RR.findAll();
	}

	@Override
	public void save(CustomerRating ratings) {
		
		RR.save(ratings);
		
	}

}
