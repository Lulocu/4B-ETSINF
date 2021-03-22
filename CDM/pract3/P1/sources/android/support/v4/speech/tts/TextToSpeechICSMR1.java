package android.support.v4.speech.tts;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.Locale;
import java.util.Set;

class TextToSpeechICSMR1 {
    public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
    public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";

    interface UtteranceProgressListenerICSMR1 {
        void onDone(String str);

        void onError(String str);

        void onStart(String str);
    }

    TextToSpeechICSMR1() {
    }

    static Set<String> getFeatures(TextToSpeech tts, Locale locale) {
        if (Build.VERSION.SDK_INT >= 15) {
            return tts.getFeatures(locale);
        }
        return null;
    }

    static void setUtteranceProgressListener(TextToSpeech tts, final UtteranceProgressListenerICSMR1 listener) {
        if (Build.VERSION.SDK_INT >= 15) {
            tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                /* class android.support.v4.speech.tts.TextToSpeechICSMR1.AnonymousClass1 */

                public void onStart(String utteranceId) {
                    listener.onStart(utteranceId);
                }

                public void onError(String utteranceId) {
                    listener.onError(utteranceId);
                }

                public void onDone(String utteranceId) {
                    listener.onDone(utteranceId);
                }
            });
        } else {
            tts.setOnUtteranceCompletedListener(new TextToSpeech.OnUtteranceCompletedListener() {
                /* class android.support.v4.speech.tts.TextToSpeechICSMR1.AnonymousClass2 */

                public void onUtteranceCompleted(String utteranceId) {
                    listener.onStart(utteranceId);
                    listener.onDone(utteranceId);
                }
            });
        }
    }
}