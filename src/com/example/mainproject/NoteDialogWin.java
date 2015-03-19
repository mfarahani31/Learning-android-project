package com.example.mainproject;

import android.app.Activity;
import android.app.Dialog;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class NoteDialogWin extends Dialog implements
		View.OnClickListener {
	public int position;
	//public EditText noteEditText;
	public String note1;

	public Activity activity;
	public Dialog d;
	//public Button yes, no;

	public NoteDialogWin(Activity a, int position) {
		super(a);
		this.activity = a;
		this.position = position;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.helpdialog);
	/*	yes = (Button) findViewById(R.id.createNoteButtonDialog_yes_tab2);
		no = (Button) findViewById(R.id.createNoteButtonDialog_no_tab2);
		yes.setOnClickListener(this);
		no.setOnClickListener(this);

		Typeface btn_yes_typeface = Typeface.createFromAsset(
				activity.getAssets(), "DroidNaskhRegularSystemUI.ttf");

		Typeface btn_no_typeface = Typeface.createFromAsset(
				activity.getAssets(), "DroidNaskhRegularSystemUI.ttf");

		no.setTypeface(btn_no_typeface);
		yes.setTypeface(btn_yes_typeface);

		noteEditText = (EditText) findViewById(R.id.createNoteEditText_tab2);
*/
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		//case R.id.helpbutton:
/*
			note1 = noteEditText.getText().toString();

			if (!note1.equals("")) {

				if (!TabFragment2.setbackground_tab2
						&& TabFragment2.Tabfragment2) {
					TabFragment2.listview_tab2
							.setBackgroundResource(drawable.box);
				}
				if (!PastTabFragment2.setbackground_pastTab2
						&& PastTabFragment2.PastTabFragment2)
					PastTabFragment2.listview_pastTab2
							.setBackgroundResource(drawable.box);

				DevOpenHelper helper = new DaoMaster.DevOpenHelper(
						getContext(), "DB", null);
				SQLiteDatabase db = helper.getWritableDatabase();
				DaoMaster daoMaster = new DaoMaster(db);
				DaoSession daoSession = daoMaster.newSession();
				NoteDao noteDao = daoSession.getNoteDao();

				Note note = new Note();
				note.setSiaghId(DBHandling.SIAGH_LIST.get(position).getId());
				note.setNoteText(note1);
				note.setNoteDate(new Date());
				note.setIsTextSelected(false);
				note.setTextSelected("");
				note.setStartAyahNumber(DBHandling.SIAGH_LIST.get(position)
						.getStartAyahNumber());
				note.setEndAyahNumber(DBHandling.SIAGH_LIST.get(position)
						.getEndAyahNumber());
				note.setSuraName(DBHandling.SIAGH_LIST.get(position)
						.getSuraName());
				note.setIsQuranNote(false);
				noteDao.insert(note);

				db.close();
				helper.close();

				DBHandling dbhandle = new DBHandling();
				dbhandle.fillNoteList(getContext());

				if (TabFragment2.Tabfragment2) {
					TabFragment2.fill(DBHandling.NOTE_LIST
							.get(DBHandling.NOTE_LIST.size() - 1));
				} else {
					PastTabFragment2.fill(DBHandling.NOTE_LIST
							.get(DBHandling.NOTE_LIST.size() - 1));
				}
				TabFragment2.Tabfragment2 = false;
			}
			break;
		*/case R.id.dialogButtonOK:
			dismiss();
			/// c.finish();
			break;
		default:
			break;
		}
		dismiss();
	}
}
