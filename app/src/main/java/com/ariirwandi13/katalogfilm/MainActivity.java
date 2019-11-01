package com.ariirwandi13.katalogfilm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MoviesItem> mMoviesList;
    private RecyclerView mRecyclerView;
    private MoviesAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        createMoviesList();
        buildRecyclerView();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure want to Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void createMoviesList() {
        mMoviesList = new ArrayList<>();
        mMoviesList.add(new MoviesItem(R.drawable.poster_joker,"Joker", "October 4, 2019", "8.6",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_maleficent,"Maleficent: Mistress of Evil", "October 18, 2019", "7.3",
                "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are pulled in different directions by impending nuptials, unexpected allies, and dark new forces at play."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_terminator,"Terminator: Dark Fate", "November 1, 2019", "6.5",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_ipman,"Ip Man 4: The Finale", "December 20, 2019", "0.0",
                "Ip Man 4 is an upcoming Hong Kong biographical martial arts film directed by Wilson Yip and produced by Raymond Wong. It is the fourth in the Ip Man film series based on the life of the Wing Chun grandmaster of the same name and features Donnie Yen reprising the role. The film began production in April 2018 and ended in July the same year."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_f2f,"Fast & Furious Presents: Hobbs & Shaw", "August 2, 2019", "6.5",
                "Ever since US Diplomatic Security Service Agent Hobbs and lawless outcast Shaw first faced off, they just have swapped smacks and bad words. But when cyber-genetically enhanced anarchist Brixton's ruthless actions threaten the future of humanity, both join forces to defeat him. (A spin-off of “The Fate of the Furious,” focusing on Johnson's Luke Hobbs and Statham's Deckard Shaw.)"));
        mMoviesList.add(new MoviesItem(R.drawable.poster_spiderman,"Spider-Man: Far from Home", "July 2, 2019", "7.6",
                "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_lion,"The Lion King", "July 19, 2019", "7.1",
                "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_el,"El Camino: A Breaking Bad Movie", "October 11, 2019", "7.1",
                "In the wake of his dramatic escape from captivity, Jesse Pinkman must come to terms with his past in order to forge some kind of future."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_angrybird,"The Angry Birds Movie 2", "August 14, 2019", "6.6",
                "Red, Chuck, Bomb and the rest of their feathered friends are surprised when a green pig suggests that they put aside their differences and unite to fight a common threat. Aggressive birds from an island covered in ice are planning to use an elaborate weapon to destroy the fowl and swine."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_zombieland,"Zombieland: Double Tap", "October 18, 2019", "7.5",
                "The group will face a new zombie threat as a new breed of zombie has developed. This new super-zombie type is faster, bigger, and stronger than the previous strain of zombies and harder to kill. These super-zombies have started grouping up into a horde going from city to city leaving a path of destruction behind them."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_toystory,"Toy Story 4", "June 21, 2019", "7.6",
                "Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy."));
        mMoviesList.add(new MoviesItem(R.drawable.poster_aladdin,"Aladdin", "May 24, 2019", "7.1",
                "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true."));


    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, 2);
        mAdapter = new MoviesAdapter(mMoviesList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new MoviesAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, mMoviesList.get(position).getTitle() + "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Example Item", mMoviesList.get(position));
                startActivity(intent);
            }
        });
    }
}
