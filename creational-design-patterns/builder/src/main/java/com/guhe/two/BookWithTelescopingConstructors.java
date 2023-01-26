package com.guhe.two;

import java.time.Year;

/**
 * Book with telescoping construcots.
 * public BookWithTelescopingConstructors(String isbn, String title, String author) {
 * // I want to create a Book with ISBN, title, and author
 * // method A
 * this(isbn, title, null, author);
 * // method B
 * //		this.isbn = isbn;
 * //		this.title = title;
 * //		this.author = author;
 * // But what if I want to create a Book with ISBN, title, and description instead of author
 * // public BookWithTelescopingConstructors(String isbn, String title, String description) {}
 * // However, the same signatrue cannot coexist in the same class
 * }
 *
 * @author njl
 * @date 2023/1/17
 */
public class BookWithTelescopingConstructors {
	// mandatory fields
	private final String isbn;
	private final String title;
	// optional fields
	private final Genre genre;
	private final String author;
	private final Year published;
	private final String description;

	public BookWithTelescopingConstructors(String isbn, String title) {
		this(isbn, title, null);
	}

	public BookWithTelescopingConstructors(String isbn, String title, Genre genre) {
		this(isbn, title, genre, null);
	}

	public BookWithTelescopingConstructors(String isbn, String title, Genre genre, String author) {
		this(isbn, title, genre, author, null);
	}

	public BookWithTelescopingConstructors(String isbn, String title, Genre genre, String author, Year published) {
		this(isbn, title, genre, author, published, null);
	}

	public BookWithTelescopingConstructors(String isbn, String title, Genre genre, String author, Year published, String description) {
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.published = published;
		this.description = description;
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
}
