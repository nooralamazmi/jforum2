/*
 * Copyright (c) JForum Team
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, 
 * with or without modification, are permitted provided 
 * that the following conditions are met:
 * 
 * 1) Redistributions of source code must retain the above 
 * copyright notice, this list of conditions and the 
 * following disclaimer.
 * 2) Redistributions in binary form must reproduce the 
 * above copyright notice, this list of conditions and 
 * the following disclaimer in the documentation and/or 
 * other materials provided with the distribution.
 * 3) Neither the name of "Rafael Steil" nor 
 * the names of its contributors may be used to endorse 
 * or promote products derived from this software without 
 * specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT 
 * HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, 
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL 
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER 
 * IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF 
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE
 * 
 * Created on 12/11/2004 18:10:57
 * The JForum Project
 * http://www.jforum.net
 */
package net.jforum.entities;

import java.io.Serializable;
import java.util.Date;

import net.jforum.view.forum.common.ViewCommon;

/**
 * @author Rafael Steil
 */
public class LastPostInfo implements Serializable
{
	private static final long serialVersionUID = -472556606758547155L;
	private long postTimeMillis;
	private int topicId;
	private int postId;
	private int userId;
	private int topicReplies;
	private String username;
	private Date postDate;
	private String topicTitle;
	private boolean hasInfo;

	public void setHasInfo(final boolean value) {
		this.hasInfo = value;
	}

	public boolean hasInfo() {
		return this.hasInfo;
	}

	/**
	 * @return Returns the postDate.
	 */
	public String getPostDate() {
		return this.postDate == null ? null : ViewCommon.formatDate(this.postDate);
	}

	public String getPostDateAsGmt() {
		return ViewCommon.formatDateAsGmt(this.postDate);
	}

	/**
	 * @param postDate The postDate to set.
	 */
	public void setPostDate(final Date postDate) {
		this.postDate = postDate;
	}

	/**
	 * @return Returns the postId.
	 */
	public int getPostId() {
		return this.postId;
	}

	/**
	 * @param postId The postId to set.
	 */
	public void setPostId(final int postId) {
		this.postId = postId;
	}

	/**
	 * @return Returns the postTimeMillis.
	 */
	public long getPostTimeMillis() {
		return this.postTimeMillis;
	}

	/**
	 * @param postTimeMillis The postTimeMillis to set.
	 */
	public void setPostTimeMillis(final long postTimeMillis) {
		this.postTimeMillis = postTimeMillis;
	}

	/**
	 * @return Returns the topicId.
	 */
	public int getTopicId() {
		return this.topicId;
	}

	/**
	 * @param topicId The topicId to set.
	 */
	public void setTopicId(final int topicId) {
		this.topicId = topicId;
	}

	/**
	 * @return Returns the topicReplies.
	 */
	public int getTopicReplies() {
		return this.topicReplies;
	}

	/**
	 * @param topicReplies The topicReplies to set.
	 */
	public void setTopicReplies(final int topicReplies) {
		this.topicReplies = topicReplies;
	}

	/**
	 * @return Returns the userId.
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * @param userId The userId to set.
	 */
	public void setUserId(final int userId) {
		this.userId = userId;
	}

	/**
	 * @return Returns the username.
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username The username to set.
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return this.topicTitle;
	}

	/**
	 * @param title The title to set.
	 */
	public void setTitle(final String title) {
		this.topicTitle = title;
	}
}
