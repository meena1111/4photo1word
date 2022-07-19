package com.example.a4photo1word;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a4photo1word.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {
    FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.firstLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://avatars.mds.yandex.net/i?id=24e981e7d6b2405f53f97c6acc9285bd-4821567-images-thumbs&n=13");
                bundle.putString("second","https://avatars.mds.yandex.net/i?id=a218756cc14fd5c37bce7209569e7cc5-3006415-images-thumbs&n=13" );
                bundle.putString("third", "https://avatars.mds.yandex.net/i?id=6f63bdfd54f694f37717d9df1eed0b4e-4840969-images-thumbs&n=13");
                bundle.putString("four", "https://avatars.mds.yandex.net/i?id=f3c98dcd9a9e1100347454627d668e4e-4533435-images-thumbs&n=13");
                bundle.putString("answer", "Зеленый");
                bundle.putString("level", "1");
                bundle.putString("prompt", "Всегда окружает нас");



                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container,gameFragment)
                        .commit();
            }
        });
        binding.secondLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://avatars.mds.yandex.net/i?id=5984a3e86f32ab02437d0a6120c0ee8b-5888700-images-thumbs&n=13");
                bundle.putString("second","https://avatars.mds.yandex.net/i?id=559dac8e3da80c17dbf4eb16cac4d46b-5712369-images-thumbs&n=13" );
                bundle.putString("third", "https://avatars.mds.yandex.net/i?id=c155e5458e6bf6b2def47ab454527398-5481636-images-thumbs&n=13");
                bundle.putString("four", "https://avatars.mds.yandex.net/i?id=7af007fcf66db417b9b5bfd0e152effe-5911611-images-thumbs&n=13");
                bundle.putString("answer", "Спорт");
                bundle.putString("level", "2");
                bundle.putString("prompt", "Один из важнейших сфер нашей жизни");



                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container,gameFragment)
                        .commit();
            }
        });
        binding.thirdLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://avatars.mds.yandex.net/i?id=395f19d274d08acb06a9800f825b7431-4114158-images-thumbs&n=13");
                bundle.putString("second", "https://avatars.mds.yandex.net/i?id=08092f38e18b298974539eecdc014a49-6356264-images-thumbs&n=13");
                bundle.putString("third", "https://avatars.mds.yandex.net/i?id=91aac43a82b770d81f750a1ab616c24a-5485332-images-thumbs&n=13");
                bundle.putString("four", "https://avatars.mds.yandex.net/i?id=4651baf36f1c42bf8e921f9a4eec6ccc-5669589-images-thumbs&n=13");
                bundle.putString("answer", "Зима");
                bundle.putString("level", "3");
                bundle.putString("prompt", "Всеми любимая время года");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();
            }
        });
    }
}
