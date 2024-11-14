import java.applet.*;
import java.net.*;
try {
AudioClip clip = Applet.newAudioClip(
new URL(“file://c:/blah/foo.wav”));
clip.play();
} catch (MalformedURLException murle) {
System.out.println(murle);
}

public class Sound {
    
}
