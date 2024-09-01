import React from 'react'
import { Swiper, SwiperSlide } from 'swiper/react'
import { EffectCoverflow, Pagination } from 'swiper/modules'
import { CarouselContainer, SlideContent } from './style'
import 'swiper/css'
import 'swiper/css/effect-coverflow'
import 'swiper/css/pagination'

import image1 from '../../assets/images/grey.png'
import image2 from '../../assets/images/grey.png'
import image3 from '../../assets/images/grey.png'
import image4 from '../../assets/images/grey.png'
import image5 from '../../assets/images/grey.png'

const slides = [
  { title: 'Grey1', image: image1 },
  { title: 'Grey2', image: image2 },
  { title: 'Grey3', image: image3 },
  { title: 'Grey4', image: image4 },
  { title: 'Grey5', image: image5 },
]

export const Carousel = () => {
  return (
    <CarouselContainer>
      <Swiper
        grabCursor
        centeredSlides
        slidesPerView={3} // Ajustado para 1.5 para aproximar as imagens
        spaceBetween={1}
        effect="coverflow"
        loop
        pagination={{ clickable: true }}
        coverflowEffect={{
          rotate: 0,
          stretch: 370,
          depth: 110,
          modifier: 0.9, // Reduzido para diminuir o espaçamento entre os slides
          slideShadows: true,
        }}
        modules={[Pagination, EffectCoverflow]}
      >
        {slides.map((slide) => (
          <SwiperSlide
            key={slide.title}
            style={{
              backgroundImage: `url(${slide.image})`,
            }}
          >
            <SlideContent>
              <h2>{slide.title}</h2>
              <a href="#">Grey</a>
            </SlideContent>
          </SwiperSlide>
        ))}
      </Swiper>
    </CarouselContainer>
  )
}
