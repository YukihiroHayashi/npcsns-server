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
@Table(name = "NpcSnsReply")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyModel {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private Integer tweetId;
	@Column
	private String userName;
	@Column
	private String reply;
	@Column
	private Date replyDate;
}