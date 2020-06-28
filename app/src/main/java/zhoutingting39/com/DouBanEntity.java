package zhoutingting39.com;

import java.io.Serializable;
import java.util.List;

public class DouBanEntity  implements Serializable{

    private String result;
    private List<ListBean> list;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable {
        /**
         * title : 多哥
         * filePath : https://movie.douban.com/subject/30271841
         * thumbPath : https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2575882765.webp
         * id : 2
         * profile : 聚焦1925年雪橇手和雪橇犬齐心协力为拯救阿拉斯加州诺姆市孩子的性命而奔波于血清接力路上的事件
         */

        private String title;
        private String filePath;
        private String thumbPath;
        private String id;
        private String profile;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getThumbPath() {
            return thumbPath;
        }

        public void setThumbPath(String thumbPath) {
            this.thumbPath = thumbPath;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProfile() {
            return profile;
        }

        public void setProfile(String profile) {
            this.profile = profile;
        }
    }

}
