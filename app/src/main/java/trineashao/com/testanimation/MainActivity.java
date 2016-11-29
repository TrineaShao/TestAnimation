package trineashao.com.testanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //声明图片组件
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //定义图片组件对象
        imageView = (ImageView) findViewById(R.id.imageView1);
        imageView = (ImageView) findViewById(R.id.imageView2);
        //加载旋转动画
        Animation roate = AnimationUtils.loadAnimation(this,R.anim.self);
        //加载平移动画
        Animation transferm = AnimationUtils.loadAnimation(this,R.anim.down);
        //定义动画集合
        AnimationSet animationSet =new AnimationSet(true);
        //将旋转动画和平移动画都添加到动画集合中
        animationSet.addAnimation(roate);
        animationSet.addAnimation(transferm);
        //图片对象播放动画集合中的所有动画
        imageView.startAnimation(animationSet);
    }
}
