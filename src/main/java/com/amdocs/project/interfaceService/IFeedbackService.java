package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.FB;
import com.amdocs.project.model.User;

public interface IFeedbackService {

	public List<FB> listFeedback();
	public Optional<FB> listId(int id);
	public int saveFeedback(FB f);
	public void delete(int id);
}
