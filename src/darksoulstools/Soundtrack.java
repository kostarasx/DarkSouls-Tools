package darksoulstools;

import java.net.URISyntaxException;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 * The soundtrack control class for the background music
 * @author Kostas Chasapis
 */
public class Soundtrack {
	private MediaPlayer mediaPlayer;
	private Media hit;

	/**
	 * Play the background theme 
	 * @param bip The file location of the music3 file
	 */
	public void playSoundtrack(String bip) {
		try {
			hit = new Media(getClass().getResource(bip).toURI().toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setVolume(Main.VOLUME);
		mediaPlayer.play();
	}

	/**
	 * Stop the background theme
	 */
	public void stopSoundtrack() {
		mediaPlayer.stop();
	}
}
