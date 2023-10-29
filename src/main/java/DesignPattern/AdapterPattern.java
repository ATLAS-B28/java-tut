package DesignPattern;
//target interface
interface MediaPlayer{
    void play(String audioType,String filename);
}
//adaptee class
class AdvancedMediaPlayer{
    public void playVlc(String filename){
        System.out.println("Playing vlc file. Name: "+filename);
    }
    public void playMp4(String filename){
        System.out.println("Playing mp4 file. Name: "+filename);
    }
}
//adapter class implementing the target interface
class MediaPlayerAdapter implements MediaPlayer{
    private final AdvancedMediaPlayer advancedMediaPlayer;
    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }
    @Override
    public void play(String audioType,String filename){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
public class AdapterPattern {//<- structural pattern
    public static void main(String[] args){
        //create instance of adapter with Adaptee class
        AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(advancedMediaPlayer);
        mediaPlayer.play("mp4","song1.mp4");
        mediaPlayer.play("vlc","song2.vlc");


    }
}
