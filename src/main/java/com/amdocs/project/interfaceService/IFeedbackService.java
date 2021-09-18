package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.Feedback;
import com.amdocs.project.model.User;

public interface IFeedbackService {

	public List<Feedback> listFeedback();
	public Optional<Feedback> listId(int id);
	public int saveFeedback(Feedback f);
	public void delete(int id);
}
