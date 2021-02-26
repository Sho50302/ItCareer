package com.example.demo.login.domain.model;

import javax.validation.GroupSequence;

@GroupSequence({
	ValidGroupNotBlank.class, 
	ValidGroupForm.class, 
	ValidGroupPattern.class})
public interface ValidGroupOrder {

}
