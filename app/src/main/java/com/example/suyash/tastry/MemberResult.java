package com.example.suyash.tastry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MemberResult extends AppCompatActivity {
    public  String date,meal,names1,names2,names3,names4,names5,names6,names7,names8;
    public TextView txtdate,m1,m2,m3,m4,m5,m6,m7,m8,p1,p2,p3,p4,p5,p6,p7,p8,user,user1,feed,sick_diet;
    public long r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_result);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            date = bundle.getString("passdate");
            txtdate = (TextView)findViewById(R.id.resultdate);
            txtdate.setText(date);
        }



        Bundle b = getIntent().getExtras();
        if (bundle != null)
        {
            meal = bundle.getString("passmeal");
            TextView txtmeal = (TextView)findViewById(R.id.resultmeal);
            txtmeal.setText(meal);
        }
        m1 = (TextView)findViewById(R.id.m1);
        m2 = (TextView)findViewById(R.id.m2);
        m3 = (TextView)findViewById(R.id.m3);
        m4 = (TextView)findViewById(R.id.m4);
        m5 = (TextView)findViewById(R.id.m5);
        m6 = (TextView)findViewById(R.id.m6);
        m7 = (TextView)findViewById(R.id.m7);
        m8 = (TextView)findViewById(R.id.m8);
        p1 = (TextView)findViewById(R.id.p1);
        p2 = (TextView)findViewById(R.id.p2);
        p3 = (TextView)findViewById(R.id.p3);
        p4 = (TextView)findViewById(R.id.p4);
        p5 = (TextView)findViewById(R.id.p5);
        p6 = (TextView)findViewById(R.id.p6);
        p7 = (TextView)findViewById(R.id.p7);
        p8 = (TextView)findViewById(R.id.p8);
        user = (TextView)findViewById(R.id.user);
        user1 = (TextView)findViewById(R.id.user1);
        feed = (TextView)findViewById(R.id.feed);
        sick_diet = (TextView)findViewById(R.id.sickDiet);

        DatabaseReference food1 = databaseReference.child(date).child(meal).child("Food Option 1");
        food1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names1 = dataSnapshot.getValue(String.class);
                m1.setText(names1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food2 = databaseReference.child(date).child(meal).child("Food Option 2");
        food2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names2 = dataSnapshot.getValue(String.class);
                m2.setText(names2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food3 = databaseReference.child(date).child(meal).child("Food Option 3");
        food3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names3 = dataSnapshot.getValue(String.class);
                m3.setText(names3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food4 = databaseReference.child(date).child(meal).child("Food Option 4");
        food4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names4 = dataSnapshot.getValue(String.class);
                m4.setText(names4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food5 = databaseReference.child(date).child(meal).child("Food Option 5");
        food5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names5 = dataSnapshot.getValue(String.class);
                m5.setText(names5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food6 = databaseReference.child(date).child(meal).child("Food Option 6");
        food6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names6 = dataSnapshot.getValue(String.class);
                m6.setText(names6);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food7 = databaseReference.child(date).child(meal).child("Food Option 7");
        food7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names7 = dataSnapshot.getValue(String.class);
                m7.setText(names7);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference food8 = databaseReference.child(date).child(meal).child("Food Option 8");
        food8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                names8 = dataSnapshot.getValue(String.class);
                m8.setText(names8);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        if (names1 != null){
        DatabaseReference per1 = databaseReference.child(date).child(meal).child("Result").child(names1);
        per1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                long r1 = (long) dataSnapshot.getChildrenCount();
                p1.setText(String.valueOf(r1));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names2 != null){
        DatabaseReference per2 = databaseReference.child(date).child(meal).child("Result").child(names2);
        per2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r2 = (int) dataSnapshot.getChildrenCount();
                p2.setText(String.valueOf(r2));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names3 != null){
        DatabaseReference per3 = databaseReference.child(date).child(meal).child("Result").child(names3);
        per3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r3 = (int) dataSnapshot.getChildrenCount();
                p3.setText(String.valueOf(r3));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names4 != null){
        DatabaseReference per4 = databaseReference.child(date).child(meal).child("Result").child(names4);
        per4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r4 = (int) dataSnapshot.getChildrenCount();
                p4.setText(String.valueOf(r4));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names5 != null){
        DatabaseReference per5 = databaseReference.child(date).child(meal).child("Result").child(names5);
        per5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r5 = (int) dataSnapshot.getChildrenCount();
                p5.setText(String.valueOf(r5));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names6 != null){
        DatabaseReference per6 = databaseReference.child(date).child(meal).child("Result").child(names6);
        per6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r6 = (int) dataSnapshot.getChildrenCount();
                p6.setText(String.valueOf(r6));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names7 != null){
        DatabaseReference per7 = databaseReference.child(date).child(meal).child("Result").child(names7);
        per7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r7 = (int) dataSnapshot.getChildrenCount();
                p7.setText(String.valueOf(r7));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}

        if (names8 != null){
        DatabaseReference per8 = databaseReference.child(date).child(meal).child("Result").child(names8);
        per8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                r8 = (int) dataSnapshot.getChildrenCount();
                p8.setText(String.valueOf(r8));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });}


        DatabaseReference feedback = databaseReference.child(date).child(meal).child("Feedback");
        feedback.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                long n = dataSnapshot.getChildrenCount();
                for (int i=1;i<=n;i++){
                    Iterable<DataSnapshot> en = dataSnapshot.getChildren();
                    user.setText(String.valueOf(en));
                    String feed1 = (String) dataSnapshot.child(String.valueOf(en)).getValue();
                    feed.setText(feed1);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        final DatabaseReference sick = databaseReference.child(date).child(meal).child("Sick Diet");
        sick.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                long n = dataSnapshot.getChildrenCount();
                for (int i=1;i<=n;i++){
                    Iterable<DataSnapshot> en = dataSnapshot.getChildren();
                    user1.setText(String.valueOf(en));
                    String sick1 = (String) dataSnapshot.child(String.valueOf(en)).getValue();
                    sick_diet.setText(sick1);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });







    }
}
