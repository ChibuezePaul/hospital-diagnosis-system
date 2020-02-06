package com.example.demo.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {
	@Autowired
	private DashboardRepository iconRepository;
	
	public Dashboard addIcon(Dashboard icon) {
		return  iconRepository.save(icon);
		
}
	public void removeIcon(Long id) {
		 iconRepository.deleteById(id);
	
	}
	public List<Dashboard> fetchIcon() {
		return iconRepository.findAll();
	}

}
