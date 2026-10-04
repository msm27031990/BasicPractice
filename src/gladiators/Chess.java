package gladiators;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 

#include<bits/stdc++.h>
using namespace std;
 
int vis[9][9];
bool safe(int x,int y){
	return x>=0&&x<8&&y>=0&&y<8&&!vis[x][y];
}
int px[]={ -2,-2,2,2,-1,-1,1,1};
int py[]={-1,1,-1,1,-2,2,-2,2};
int bfs(int x,int y,int s,int t){
	queue<pair< pair<int,int> ,int> >q;
	memset(vis,0,sizeof(vis));
	q.push( make_pair( make_pair(x,y),0));
	vis[x][y]=1;
	int i;
	while(!q.empty()){
		pair< pair<int,int>,int >pp=q.front();
		q.pop();
		int x=pp.first.first;
		int y=pp.first.second;
		int d=pp.second;
		if(x==s&&y==t)
			return d;
		for(i=0;i<8;i++){
			int xx=x+px[i];
			int yy=y+py[i];
			if(safe(xx,yy)){
				if((xx==s&&yy!=t)||(xx!=s&&yy==t))
					continue;
				vis[xx][yy]=1;
				q.push( make_pair( make_pair(xx,yy),d+1));
			}
		}
	}
	return 0;
}
int main(){
	int t;
	cin>>t;
	while(t--){
		int x,y,s,t;
		cin>>x>>y>>s>>t;
		cout<<bfs(x,y,s,t)<<endl;
	}
	return 0;
} 
 */
	}

}
