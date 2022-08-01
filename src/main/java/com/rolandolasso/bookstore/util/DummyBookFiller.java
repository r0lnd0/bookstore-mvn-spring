package com.rolandolasso.bookstore.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.rolandolasso.bookstore.model.Book;
import com.rolandolasso.bookstore.service.BookService;

@Component
public class DummyBookFiller {
  private final BookService bookService;

  public DummyBookFiller(BookService bookService) {
    this.bookService = bookService;
  }

  @PostConstruct
  public void init() {
    bookService.addBook(new Book(null, "To Kill a Mockingbird",
        "The unforgettable novel of a childhood in a sleepy Southern town and the crisis of conscience that rocked it. \"To Kill A Mockingbird\" became both an instant bestseller and a critical success when it was first published in 1960. It went on to win the Pulitzer Prize in 1961 and was later made into an Academy Award-winning film, also a classic.",
        "Harper Lee", 30.00, 10));
    bookService.addBook(new Book(null, "Harry Potter and the Sorcerer's Stone",
        "Harry Potter's life is miserable. His parents are dead and he's stuck with his heartless relatives, who force him to live in a tiny closet under the stairs. But his fortune changes when he receives a letter that tells him the truth about himself: he's a wizard. A mysterious visitor rescues him from his relatives and takes him to his new home, Hogwarts School of Witchcraft and Wizardry.",
        "J.K. Rowling", 30.00, 10));
    bookService.addBook(new Book(null, "Pride and Prejudice",
        "Since its immediate success in 1813, Pride and Prejudice has remained one of the most popular novels in the English language. Jane Austen called this brilliant work \"her own darling child\" and its vivacious heroine, Elizabeth Bennet, \"as delightful a creature as ever appeared in print.\" The romantic clash between the opinionated Elizabeth and her proud beau, Mr. Darcy, is a splendid performance of civilized sparring. And Jane Austen's radiant wit sparkles as her characters dance a delicate quadrille of flirtation and intrigue, making this book the most superb comedy of manners of Regency England.",
        "Jane Austen", 30.00, 10));
    bookService.addBook(new Book(null, "The Diary of a Young Girl",
        "Discovered in the attic in which she spent the last years of her life, Anne Frank’s remarkable diary has become a world classic—a powerful reminder of the horrors of war and an eloquent testament to the human spirit.",
        "Anne Frank", 30.00, 10));
    bookService.addBook(new Book(null, "1984",
        "Among the seminal texts of the 20th century, Nineteen Eighty-Four is a rare work that grows more haunting as its futuristic purgatory becomes more real. Published in 1949, the book offers political satirist George Orwell's nightmarish vision of a totalitarian, bureaucratic world and one poor stiff's attempt to find individuality. The brilliance of the novel is Orwell's prescience of modern life—the ubiquity of television, the distortion of the language—and his ability to construct such a thorough version of hell. Required reading for students since it was published, it ranks among the most terrifying novels ever written.",
        "George Orwell", 30.00, 10));
    bookService.addBook(new Book(null, "Animal Farm",
        "A farm is taken over by its overworked, mistreated animals. With flaming idealism and stirring slogans, they set out to create a paradise of progress, justice, and equality. Thus the stage is set for one of the most telling satiric fables ever penned –a razor-edged fairy tale for grown-ups that records the evolution from revolution against tyranny to a totalitarianism just as terrible.",
        "George Orwell", 30.00, 10));
    bookService.addBook(new Book(null, "The Little Prince",
        "A pilot stranded in the desert awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the stranger, \"draw me a sheep.\" And the pilot realizes that when life's events are too difficult to understand, there is no choice but to succumb to their mysteries. He pulls out pencil and paper... And thus begins this wise and enchanting fable that, in teaching the secret of what is really important in life, has changed forever the world for its readers.",
        "Antoine de Saint-Exupéry", 30.00, 10));
    bookService.addBook(new Book(null, "The Great Gatsby",
        "F. Scott Fitzgerald's third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story of the fabulously wealthy Jay Gatsby and his love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted \"gin was the national drink and sex the national obsession,\" it is an exquisitely crafted tale of America in the 1920s.",
        "F. Scott Fitzgerald", 30.00, 10));
  }
}
