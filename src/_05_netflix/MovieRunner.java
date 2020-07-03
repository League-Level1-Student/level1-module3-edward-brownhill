package _05_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Some marvel thing", 4);
		Movie movie2 = new Movie("Cars 7", 5);
		Movie movie3 = new Movie("Twilight", 1);
		Movie movie4 = new Movie("Some disney ripoff", 2);
		Movie movie5 = new Movie("horribly written sob story", 1);
		System.out.println(movie1.getTicketPrice());
		System.out.println(movie2.getTicketPrice());
		System.out.println(movie3.getTicketPrice());
		System.out.println(movie4.getTicketPrice());
		System.out.println(movie5.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		queue.sortMoviesByRating();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.getBestMovie2());
	}
}
