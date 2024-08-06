
  import java.util.*;

  class Solution {
    public int[] solution(String[] genres, int[] plays) {

      List<Song> result = new ArrayList<>();
      List<Song> songs = new ArrayList<>();
      for(int i = 0; i<genres.length;i++){
        songs.add(new Song(i,genres[i],plays[i]));
      }
      Map<String,Integer> genreNum = new HashMap<>();
      songs.sort(new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
          return - o1.playNum.compareTo(o2.playNum);
        }
      });
      for(int i =0; i<songs.size();i++){
        if(genreNum.get(songs.get(i).genre)==null){
          genreNum.put(songs.get(i).genre,songs.get(i).playNum);
        }else{
          Song song = songs.get(i);
          genreNum.put(song.genre,genreNum.get(song.genre)+song.playNum);
        }
      }
    songs.sort(new Comparator<Song>() {
      public int compare(Song o1, Song o2){
        if(o1.genre!=o2.genre){
          return -genreNum.get(o1.genre).compareTo(genreNum.get(o2.genre));
        }else if(o1.genre==o2.genre&&!o1.playNum.equals(o2.playNum)){
          return -o1.playNum.compareTo(o2.playNum);
        }else{
          return o1.songNum.compareTo(o2.songNum);
        }
      }
    });


      boolean greNum = true;
      for(int i=0; i<songs.size();i++){

        if(i==0){
          result.add(songs.get(i));
        }else if(songs.get(i).genre.equals(songs.get(i-1).genre)&&greNum){
          result.add(songs.get(i));
          greNum = false;
        }else if(!songs.get(i).genre.equals(songs.get(i-1).genre)){
          result.add(songs.get(i));
          greNum = true;
        }
      }

      int[] answer = new int[result.size()];
      for(int i =0; i<result.size();i++){
       answer[i] = result.get(i).songNum;
      }

      return answer;
    }
   static class  Song{


     Integer songNum;
      Integer playNum;
      String genre;
      public Song(Integer songNum,String genre, Integer playNum){
        this.songNum = songNum;
        this.genre = genre;
        this.playNum = playNum;
      }
   }
  }
