package com.ariirwandi13.katalogfilm;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private int dummyColor;

    public TvShowFragment() {
    }

    @SuppressLint("ValidFragment")
    TvShowFragment(int color) {
        this.dummyColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_layout_dummy);
        frameLayout.setBackgroundColor(dummyColor);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_dummy);

        LinearLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        ArrayList<MoviesItem> mTvShowList = new ArrayList<>();
        mTvShowList.add(new MoviesItem(R.drawable.poster_mandalorian, "The Mandalorian", "November 12, 2019", "7.6",
                "Set after the fall of the Empire and before the emergence of the First Order, we follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_hisdarkm, "His Dark Materials", "November 3, 2019", "7.8",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_see, "See", "November 1, 2019", "7.8",
                "A virus has decimated humankind. Those who survived emerged blind. Centuries later when twins are born with the mythic ability to see, their father must protect his tribe against a threatened queen."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_batwoman, "Batwoman", "October 6, 2019", "6.2",
                "Kate Kane, armed with a passion for social justice and a flair for speaking her mind, soars onto the streets of Gotham as Batwoman, an out lesbian and highly trained street fighter primed to snuff out the failing city's criminal resurgence. But don't call her a hero yet. In a city desperate for a savior, Kate must overcome her own demons before embracing the call to be Gotham's symbol of hope."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_carnival, "Carnival Row", "August 29, 2019", "7.9",
                "In a mystical and dark city filled with humans, fairies and other creatures, a police detective investigates a series of gruesome murders leveled against the fairy population. During his investigation, the detective becomes the prime suspect and must find the real killer to clear his name."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_doom, "Doom Patrol", "February 15, 2019", "6.4",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_mortel, "Mortel", "November 21, 2019", "5.6",
                "Sofiane, Victor and Luisa, three seemingly incompatible teenagers find themselves bound together by a supernatural force."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_watchman, "Watchmen", "October 20, 2019", "7.2",
                "Set in an alternate history where “superheroes” are treated as outlaws, “Watchmen” embraces the nostalgia of the original groundbreaking graphic novel while attempting to break new ground of its own."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_case, "Case File nº221: Kabukicho", "October 11, 2019", "7.0",
                "Shinjuku ward east side... The center of the street with most chaos, There's a Kabukicho with full of neon lights. When the light is stronger, the shadow is deeper. The story begins when certain bizarre murder happens one night! Suspense? Or Comedy? Drama that cannot identify begins!"));
        mTvShowList.add(new MoviesItem(R.drawable.poster_theboys, "The Boys", "July 25, 2019", "8.1",
                "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_dollface, "Dollface", "November 15, 2019", "3.8",
                "After being dumped by her longtime boyfriend, a young woman must deal with her own imagination in order to literally and metaphorically re-enter the world of women, and rekindle the female friendships she left behind."));
        mTvShowList.add(new MoviesItem(R.drawable.poster_mrsfletcher, "Mrs. Fletcher", "October 27, 2019", "8.5",
                "A dual coming-of-age comedy exploring the impact of internet porn and social media, Mrs. Fletcher follows empty nest divorcée Eve Fletcher — as she reinvents her life to find the happiness and sexual fulfillment that’s eluded her, and her college freshman son Brendan."));

        MoviesAdapter moviesAdapter = new MoviesAdapter(mTvShowList, getContext());
        moviesAdapter.setHasStableIds(true);
        recyclerView.setAdapter(moviesAdapter);

        return view;
    }

}
