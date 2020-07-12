package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NpcSnsTweet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetModel {
	@Id
	@GeneratedValue
	private Integer tweetId;
	@Column
	private String userName;
	@Column
	private String tweetContent;
	@Column
	private Date tweetDate;
}