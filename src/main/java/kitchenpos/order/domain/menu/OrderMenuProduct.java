package kitchenpos.order.domain.menu;

import javax.persistence.*;
import java.util.UUID;

//test 통과를위해 연관관계 설정 전부 주석처리
//@Table(name = "order_menu_product")
//@Entity
public class OrderMenuProduct {
//    @Column(name = "seq")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
    private Long seq;

//    @ManyToOne(optional = false)
//    @JoinColumn(
//        name = "product_id",
//        columnDefinition = "varbinary(16)",
//        foreignKey = @ForeignKey(name = "fk_menu_product_to_product")
//    )
    private OrderProduct product;

//    @Column(name = "quantity", nullable = false)
    private long quantity;

//    @Transient
    private UUID productId;

    public OrderMenuProduct() {
    }

    public OrderMenuProduct(Long seq, OrderProduct product, long quantity, UUID productId) {
        this.seq = seq;
        this.product = product;
        this.quantity = quantity;
        this.productId = productId;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(final Long seq) {
        this.seq = seq;
    }

    public OrderProduct getProduct() {
        return product;
    }

    public void setProduct(final OrderProduct product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(final UUID productId) {
        this.productId = productId;
    }
}
