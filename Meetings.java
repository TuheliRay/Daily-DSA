import java.util.ArrayList;
import java.util.List;
class Meetings {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    class Meeting{
        int start;
        int end;
        Meeting(int start , int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=start.length;
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new Meeting(start[i], end[i]));
        }
        meetings.sort((m1, m2) -> m1.end - m2.end);
        int count=0 , freetime=-1;
        for(Meeting m:meetings){
            if(m.start>freetime){
                count++;
                freetime=m.end;
            }
        }
        return count;
    }
}
