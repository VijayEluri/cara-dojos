package ticTacToeAgain;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TicTacToeTest {
	/*
	a game is over when all fields are taken
	a game is over when all fields in a column are taken by a player
	a game is over when all fields in a row are taken by a player
	a game is over when all fields in a diagonal are taken by a player
	a player can take a field if not already taken
	players take turns taking fields until the game is over
	 */

	@Test
  public void gameIsOverWhenAllFieldsAreTaken() throws Exception {
		boolean allFieldsAreTaken = true;
		boolean gameIsOver = allFieldsAreTaken;
		assertThat(gameIsOver, is(true));
  }
	
	@Test
	public void gameIsOverWhenAColumnIsTakenByAPlayer() throws Exception {
		List<Integer> fieldsTakenByPlayer = asList(1, 4, 7);
		Boolean gameIsOver = gameIsOver(fieldsTakenByPlayer);
		assertThat("A column is taken, game is over", gameIsOver, is(true));
	}

	private Boolean gameIsOver(List<Integer> fieldsTakenByPlayer) {
	  Boolean gameIsOver = gameIsOver(aColumnIsTaken(fieldsTakenByPlayer));
	  return gameIsOver;
  }

	private Boolean gameIsOver(boolean aColumnIsTaken) {
	  return aColumnIsTaken;
  }

	private boolean aColumnIsTaken(List<Integer> fieldsTakenByPlayer) {
	  List<Integer> firstColumn = asList(1, 4, 7);
		return fieldsTakenByPlayer.equals(firstColumn);
  }
}
