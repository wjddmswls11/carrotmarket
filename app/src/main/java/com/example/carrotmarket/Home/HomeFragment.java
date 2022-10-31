package com.example.carrotmarket.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recv_user;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        recv_user = v.findViewById(R.id.recv_user);

        ArrayList<HomeDTO> list = new ArrayList<>();
        list.add(new HomeDTO(R.drawable.home_item1_1, R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item1_2,0,0,R.drawable.profile_round_person,
                R.drawable.item_home_01, R.drawable.item_home_02, R.drawable.item_home_03, R.drawable.item_home_04,
                "플립 2 팝니다", "광산구 첨단2동","끌올 그저께",
                "150,000원","0","4","똠부기",
        "디지털기기","이번에 액정교체 하였답니다\n깨끗하고 잔 기스 없습니다","158",
                "아이폰 13프로 512 골드 팔아요","120만원","홍미노트10 프로 8기가 팝니다","220,000원",
                "아이폰 11프로 256G 화이트 판매합...","450,000원","갤럭시s22플러스 256","850,000원"
                ));

        list.add(new HomeDTO(R.drawable.home_item2_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item2_2,0,0,R.drawable.intent_member_img1,
                R.drawable.item2_home_01,R.drawable.item_home_02,R.drawable.item_home_03,R.drawable.item_home_04,
                "구글 크롬캐스트 4 스카이 (미개봉 새상품)","상무1동","3시간 전",
                "75,000원","0","6","당근토끼",
                "디지털기기","아이폰,아이패드,안드로이드,맥,윈도우,크롬북에서\n작동 가능한 구글 크롬케스트4입니다\n리모컨 포함입니다","177",
                "캐트리스 올라운드 컨실러 팔레트 (미...","3,000원","닥터스 리페어 마데셀 크림","20,000원",
                "라네즈 네오쿠션 노보 콜라보 본품+리필","20,000원","한율 산들박하 토너 진정크림 2종 세...","23,000원"
        ));

        list.add(new HomeDTO(R.drawable.home_item3_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item3_2,0,0,R.drawable.profile_round_person,
                R.drawable.item3_home_01,R.drawable.item3_home_02,R.drawable.item3_home_03,R.drawable.item3_home_04,
                "삼성 레이저 프린트","광산구 흑석동","끌올 1분 전",
                "60,000원","1","2","엄마입니다",
                "디지털기기","구입은 4년전\n사용은 1년미만\n검정.잉크교환됨\n칼라만바꿔서사용하세요","170",
                "홈빠의자 2개","100,000원","입간판 배너","60,000원",
                "조향대","180,000원","빔프로젝트 스크린","80,000원"
                ));
        list.add(new HomeDTO(R.drawable.home_item4_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item4_2,R.drawable.home_item4_3,R.drawable.home_item4_4,R.drawable.intent_member_img2,
                R.drawable.item4_home_01,R.drawable.item4_home_02,R.drawable.item4_home_03,R.drawable.item4_home_04,
                "엘로치오 마누스V2","광산구 첨단2동","끌올 그제께",
                "900,000원","0","4", "탈레랑",
                "생활가전","2020년 6월에 구매 했습니다 \n\n 구성품 엘로치오 마누스V2,샤워스크린(일체형방식) 2개. 가스켓 6개,\n템퍼, 마카롱 탬퍼 덴테이션 블랙 58mm, 템퍼받침대, 침칠봉 58mm","87",
                "갤럭시탭 팝니다. 손주 유튜브 보여주...","95,000원","버즈2프로 미개봉","165,000원",
                "와이파이 증폭기","5,000원","ps4 pro 7117b ssd5000기가 판...","220,000원"
                ));

        list.add(new HomeDTO(R.drawable.home_item5_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item5_2,R.drawable.home_item5_3,R.drawable.home_item5_4,R.drawable.profile_round_person,
                R.drawable.item5_home_01,R.drawable.item5_home_02,R.drawable.item5_home_03,R.drawable.item5_home_04,
                "소형 냉장고 팝니다","광산구 우산동","그저께",
                "120,000원","4","4","주옥",
                "디지털기기","사용 거의 안했습니다 옮기시는거 생각해서 싸게 올립니다!","248",
                "옷장 판매합니다.","30,000원","퀸사이즈 매트리스 판매합니다","20,000원",
                "테이블 판매하니다","60,000원","유아 안전 울타리 / 애견 울타리 판매...","8,500원"
        ));
        list.add(new HomeDTO(R.drawable.home_item6_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item6_2,R.drawable.home_item6_3,R.drawable.home_item6_4,R.drawable.intent_member_img3,
                R.drawable.item6_home_01,R.drawable.item6_home_02,R.drawable.item6_home_03,R.drawable.item6_home_04,
                "원적외선 반신욕 사우나","서구 풍암동","끌올 23분 전",
                "650,000원","0","3", "뚱이",
                "생활가전","작년에110에 구매했습니다\n정상작동되고 사서 5번도 안썻고\n직접 가져가셔야 합니다","169",
                "갤럭시탭","70,000원","갤럭시노트20 울트라","380,000원",
                "LG 울트라 pc 노트북 판매","180만원","차량용 청소기","10,000원"
                ));

        list.add(new HomeDTO(R.drawable.home_item7_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                0,0,0,R.drawable.profile_round_person,
                R.drawable.item7_home_01,R.drawable.item7_home_02,R.drawable.item7_home_03,R.drawable.item7_home_04,
                "로렉스 요트마스터 42 옐로우","서구 농성1동","끌올 그저께",
                "4100만원","4","5","치평동장사꾼",
                "생활가전","22년 10월 국내 풀셋 네고 ㅈㅅ\n필름까지 같이 드림","847",
                "롤렉스 서브마리너 헐크 20.04 팝니...","3070만원","나이키 에어포스 1 '07 LV8 Point...","100,000원",
                "골드필드 팔찌","15,000원","고야드 지갑","700,000원"
        ));
        list.add(new HomeDTO(R.drawable.home_item8_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item8_2,R.drawable.home_item8_3,R.drawable.home_item8_4,R.drawable.profile_round_person,
                R.drawable.item8_home_01,R.drawable.item8_home_02,R.drawable.item8_home_03,R.drawable.item8_home_04,
                "ps5 플스5 플레이스테이션5 판매합니다","남구 월산동","6시간 전",
                "500,000원","2","3","VV",
                "디지털기기","금일 저녁 거래 가능합니다\n,-오셔서 거래하는 조건입니다.\npPS5 판매합니다.","221",
                "PS2 하드플스 5만번 아쿠아블루","79,800원","PS4 1TB 판매합니다.","230,000원",
                "엑스박스원 엑스박스 XBOXONE","80,000원","플스4 프로 1테라","315,000원"
        ));






        HomeAdapter adapter = new HomeAdapter(inflater, list, getContext());


        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL,false
        );


        recv_user.setAdapter(adapter);
        recv_user.setLayoutManager(manager);


        return v;
    }
}