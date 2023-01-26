package com.guhe.two;

import java.time.Year;

/**
 * @author njl
 * @date 2023/1/17
 */
public class BookWithBuilder {
	private final String isbn;
	private final String title;
	private final Genre genre;
	private final String author;
	private final Year published;
	private final String description;

	private BookWithBuilder(BookBuilder builder) {
		this.isbn = builder.isbn;
		this.title = builder.title;
		this.genre = builder.genre;
		this.author = builder.author;
		this.published = builder.published;
		this.description = builder.description;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public Year getPublished() {
		return published;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "BookWithBuilder{" +
				"isbn='" + isbn + '\'' +
				", title='" + title + '\'' +
				", genre=" + genre +
				", author='" + author + '\'' +
				", published=" + published +
				", description='" + description + '\'' +
				'}';
	}

	public static class BookBuilder {
		// immutable state
		private final String isbn;
		private final String title;
		// mutable state
		private Genre genre;
		private String author;
		private Year published;
		private String description;

		public BookBuilder(String isbn, String title) { // pass mandatory parameters
			if (isbn == null || title == null) {
				throw new IllegalArgumentException("isbn and title can not be null");
			}
			this.isbn = isbn;
			this.title = title;
		}

		public BookBuilder genre(Genre genre) {
			this.genre = genre;
			return this;
		}

		public BookBuilder author(String author) {
			this.author = author;
			return this;
		}

		public BookBuilder published(Year published) {
			this.published = published;
			return this;
		}

		public BookBuilder description(String description) {
			this.description = description;
			return this;
		}

		public BookWithBuilder build() {
			// State validation
			validate();
			return new BookWithBuilder(this);
		}

		private void validate() {
			// validate all fields that are going to be used to create BookWithBuilder instance
			if (isbn == null) {
				throw new IllegalArgumentException("ISBN must not be null.");
			}
			if (title == null) {
				throw new IllegalArgumentException("Title must have at least 2 characters.");
			}
			// do some other simalar validations for fields genre, author, published, and description
		}
	}
}
