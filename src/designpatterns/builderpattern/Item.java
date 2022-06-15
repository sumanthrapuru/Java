package designpatterns.builderpattern;

class Item {
    String name;
    Category category;

    private Item() {
    }

    static class ItemBuilder {
        String name;
        Category category;

        private ItemBuilder() {
        }

        ItemBuilder setName(String name) {
            this.name = name;
            return this;
        }

        ItemBuilder setCategory(Category category) {
            this.category = category;
            return this;
        }

        Item build() {
            Item i = new Item();
            i.name = this.name;
            i.category = this.category;
            return i;
        }
    }

    static public ItemBuilder builder() {
        return new ItemBuilder();
    }
}