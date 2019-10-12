 // create UI programmatically
 RelativeLayout relativeLayout = new RelativeLayout(this);
 relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
         RelativeLayout.LayoutParams.MATCH_PARENT,
         RelativeLayout.LayoutParams.MATCH_PARENT
         ));
 setContentView(relativeLayout);
 ImageView imageView = new ImageView(this);
 imageView.setLayoutParams(new RelativeLayout.LayoutParams(
         RelativeLayout.LayoutParams.WRAP_CONTENT,
         RelativeLayout.LayoutParams.WRAP_CONTENT
 ));
 relativeLayout.addView(imageView);
 imageView.setImageDrawable(getResources().getDrawable(R.drawable.sample));
 ProgressBar progressBar = new ProgressBar(this);
 RelativeLayout.LayoutParams progressParams = new RelativeLayout.LayoutParams(
         RelativeLayout.LayoutParams.WRAP_CONTENT,
         RelativeLayout.LayoutParams.MATCH_PARENT
 );
 progressParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
 progressBar.setLayoutParams(progressParams);
 relativeLayout.addView(progressBar);
