class tester {
  public static void main(String[] args){
    String filename = "simpleReview.txt";

    double totalSentiment = Review.totalSentiment(filename);
    int stars = Review.starRating(filename);
    
    String fakeReview = Review.fakeReview(filename);

    double roundedSentiment = Math.round(totalSentiment * 100.0) / 100.0;
    System.out.println(roundedSentiment + " | " + stars );
    System.out.println(fakeReview);
  }
}
