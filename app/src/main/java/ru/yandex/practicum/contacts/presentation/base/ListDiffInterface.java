package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T>{
    @Override
    boolean equals(Object obj);
    boolean theSameAs(T other);

}
