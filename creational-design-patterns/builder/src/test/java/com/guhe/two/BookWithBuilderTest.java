package com.guhe.two;

import org.junit.Test;

import java.time.Year;

/**
 * @author njl
 * @date 2023/1/17
 */
public class BookWithBuilderTest {
	@Test
	public void testBuilder() {
		BookWithBuilder.BookBuilder bookBuilder = new BookWithBuilder.BookBuilder(
				"0-12-345678-9", "Moby-Dick"
		)
				.genre(Genre.NOVEL)
				.author("Herman Melville")
				.published(Year.of(1851))
				.description("description omitted for brevity");
		// create a first book object
		BookWithBuilder book = bookBuilder.build();
		System.out.println("book = " + book);
		// Fields within the bookBuilder has been populated.
		// Create a second, slightly different, object reusing the same Builder instance
		book = bookBuilder.published(Year.of(1952)).build();
		System.out.println("book = " + book);

	}
}
