import java.io.IOException;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

public class MessageSender extends AsyncTask<String, Void, Void>{
	
	private Context context;
	
	public MessageSender(Context context) {
		this.context = context;
	}
	
	@Override
	protected Void doInBackground(String... params) {
		GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(context);
		try {
            Bundle data = new Bundle();
                gcm.send(params[0] , params[1], data);
                
        } catch (IOException ex) {
            
        } catch (Exception ex) {
            
        }
		return null;
	}
	@Override
	protected void onCancelled(Void result) {
		
	}
}
