import java.util.Arrays;

public class testMain{
  public static void main(String[] args){
		Oldsfeed feed;
    if(args[0].equals("Robot")){
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Oldsfeed(robotTopics);
    }
    else if(args[0].equals("Human")){
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Oldsfeed(humanTopics);
    }
    else{
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Oldsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}
