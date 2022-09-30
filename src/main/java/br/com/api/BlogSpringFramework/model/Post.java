package br.com.api.BlogSpringFramework.model;

import javax.persistence.*;

/**

 Classe que representa um postagem do blog.

 **/
@Entity
@Table(name="Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="content")
    private String content;

    @Column(name="DateTime")
    private String postingTimeAndDate;

    /**
     *
     * Retorna o id da postagem.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * Atribui um valor à id da postagem.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * Retorna o títilo da postagem.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * Atribui um título à postagem.
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * Retorna o nome do autor da postagem.
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * Atribui um nome ao autor da postagem.
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * Retorna o conteúdo da postagem.
     *
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * Atribui o conteúdo da postagem.
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * Retorna a data e a hora de publicação da postagem.
     *
     * @return postingTimeAndDate
     */
    public String getPostingTimeAndDate() {
        return postingTimeAndDate;
    }

    /**
     *
     * Atribui a data e a hora da postagem.
     *
     * @param postingTimeAndDate
     */
    public void setPostingTimeAndDate(String postingTimeAndDate) {
        this.postingTimeAndDate = postingTimeAndDate;
    }
}
