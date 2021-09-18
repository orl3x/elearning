package com.amdocs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.project.interfaceService.IFeedbackService;
import com.amdocs.project.interfaces.IFeedback;
import com.amdocs.project.interfaces.IUser;
import com.amdocs.project.model.Feedback;
import com.amdocs.project.model.User;


@Service
public class FeedbackService implements IFeedbackService{
	
	@Autowired
	private IFeedback data;

	@Override
	public List<Feedback> listFeedback() {
		// TODO Auto-generated method stub
		return (List<Feedback>)data.findAll();
	}

	@Override
	public Optional<Feedback> listId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int saveFeedback(Feedback f) {
		// TODO Auto-generated method stub
		int res = 0;
		Feedback feedback = data.save(f);
		if(!feedback.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
