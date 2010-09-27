package org.ale.krasha;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MayneAktiviti extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListAdapter adapter = createAdapter();
        setListAdapter(adapter);
        }
    
    
		@Override
		protected void onListItemClick(ListView l, View v, int position, long id) {
			
			switch(position){
			case 0:
				Intent thissa = new Intent(MayneAktiviti.this,StackOverflow.class); 
				startActivity(thissa);
				break;
			case 1:
				Integer nulla = null;
				nulla = nulla + nulla;
				break;
			case 2:
				Intent notfound = new Intent(MayneAktiviti.this, NotFound.class); 
				startActivity(notfound);
				break;
			case 3:
				String poo = "poo";
				poo = poo.substring(4, 5);
				break;
			case 4:
				int[] asdf = {1, 2, 3};
				asdf[5] = asdf[5];
				break;
			case 5:
				Intent supernot = new Intent(MayneAktiviti.this, SuperNotCalled.class); 
				startActivity(supernot);
				break;
			}
			
			// TODO Auto-generated method stub
			super.onListItemClick(l, v, position, id);
		}

    
        /**
        * Creates and returns a list adapter for the current list activity
        * @return
        */
        protected ListAdapter createAdapter(){
        // Create some mock data
        String[] testValues = new String[] {
        "StackOverflowException",
        "NullPointerException",
        "ActivityNotFoundException",
        "StringIndexOutOfBoundsException",
        "ArrayIndexOutOfBoundsException",
        "SuperNotCalledExceptionException"
        };

        // Create a simple array adapter (of type string) with the test values
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testValues);

        return adapter;
        }
        
    
}