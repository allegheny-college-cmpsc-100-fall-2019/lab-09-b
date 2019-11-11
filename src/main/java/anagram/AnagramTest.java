package wordgames;

/** Tests if two terms are anagrams.
 *
 * @author {Your Name Here}
 */
public class AnagramTest {
 
  private char[] nameA;
  private char[] nameB;
  
  /** Constructor.
   *
   * @param nameA The first name to compare
   * @param nameB The second name to compare
   */
  public AnagramTest (String nameA, String nameB) {
    nameA = nameA.toLowerCase().replace(" ","");
    nameB = nameB.toLowerCase().replace(" ","");
    this.nameA = nameA.toCharArray();
    this.nameB = nameB.toCharArray();
    sortCharacters();
  }
  
  /** Calls the sort method.
   *
   */
  private void sortCharacters() {
    this.nameA = sort(this.nameA, this.nameA.length);
    this.nameB = sort(this.nameB, this.nameB.length);
  }
  
  /** Sorts arrays representing names.
   *
   * @param array The array to sort
   */
  /*
   * TODO Implement private sort method to recursively sort 1D array
   */
  
  /** Returns result of various anagram tests.
   *
   */
  /*
   * TODO Implement public testWords method to test if words are anagrams
   */
}